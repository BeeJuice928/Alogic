/**
 * LIOJ 1004 聯誼順序比大小
 * 
 * 輸出A的情況 : 
 *  1. a > b  &&  bar = 1
 *  2. a < b  &&  bar = -1
 * 其餘為B
 */

var readline = require('readline');

var lines = [];
var rl = readline.createInterface({
    input: process.stdin
});

rl.on('line', function (line) {
    lines.push(line);
});

function compare (a, b, bar) {
    let f = 1 ;
    if (a === b) 
        return 'DRAW';
    if (a < b) 
        f = -1;
    if (f * bar === 1) 
        return 'A';
    return 'B';
}

function solve(line) {
    const times = line[0];
    for (let i = 1; i <= times; i++) {
        const [a, b, bar] = line[i].split(' ');
        console.log(compare(BigInt(a), BigInt(b), Number(bar)));
    }
}

rl.on('close', () => solve(lines));