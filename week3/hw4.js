/**
 * LIOJ 1030 判斷迴文
 */
var readline = require('readline');

var lines = [];
var rl = readline.createInterface({
    input: process.stdin
});

rl.on('line', function (line) {
    lines.push(line);
});

function solve(line) {
    console.log(line[0].split('').reverse().join('') === line[0] ? 'True':'False');
}

rl.on('close', () => solve(lines));