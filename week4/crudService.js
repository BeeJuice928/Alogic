/**
 *  CRUD FOR Lidemy Book, Implement By Module 'request'
 */

const request = require('request');

function query(url,id){
    request.get(`${url}/${id}`, (error, response, body) => {
      if (error) { return; }
      console.log(JSON.parse(body).name ? JSON.parse(body).name : 'Not exist.');
    });
}

function search(url,limit){
    request.get(`${url}?_limit=` + `${limit}`, (error, response, body) => {
        if (error) { console.log(reqErr); return; }
        JSON.parse(body).forEach(book => console.log(`${book.id} ${book.name}`));
     });
}


function create(url,name){
    request.post({
      url: url,
      form: { name },
    },
    (error, response, body) => {
      if (error) { console.log(reqErr); return; }
      console.log(`Now the book named "${name}" has been created.`);
    });
}

function update(url,id,name){
    request.patch({
      url: `${url}/${id}`,
      form: { name },
    },
    (error, response, body) => {
      if (error) { console.log(reqErr); return; }
      if (!JSON.parse(body).name) { console.log('Not exist.'); return; }
      console.log(`Now the book that id is ${id} has been renamed to "${name}".`);
    }); 
}

function del(url,id){
    request.delete(`${url}/${id}`, (error, response, body) => {
      if (error) { return; }
      console.log(`Now the book that id is ${id} has been deleted.`);
    });
}

const crudService = { query:query,  search:search, create:create, update:update, del:del};

module.exports = crudService;