/**
 * GET JSON DATA BY AJAX 
 */

// modules import
const axios = require('axios')
const request = require('request')

// 
const url = 'https://lidemy-book-store.herokuapp.com'
    
    
axios.get(`${url}/books?_limit=10`)
    .then(res => {
        console.log('--------Axios 輸出--------')
        for (const i in res.data) {
            console.log(`${res.data[i].id} ${res.data[i].name}`)
         }
    console.log('--------Axios 輸出結束--------\n')
  })
  .catch(err => {
    console.log(err)
  })


request.get(`${url}/books?_limit=10`, (error, res, body) => {
  if (error) {
    console.log(error)
    return
  }
  let data
  try {
    data = JSON.parse(body)
  } catch (error) {
    console.log(error)
    return
  }
  console.log('--------request 輸出--------')
  for (const i in data) {
    console.log(`${data[i].id} ${data[i].name}`)
  }
  console.log('--------request 輸出結束--------\n')
})