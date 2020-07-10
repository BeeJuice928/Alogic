/* eslint-disable no-unused-vars */

const crudService = require('./crudService.js');


const baseUrl = 'https://lidemy-book-store.herokuapp.com/books';


function main() {
    crudService.search(baseUrl,'10');
    crudService.query(baseUrl,'10');
}

main();