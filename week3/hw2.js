/**
 * LIOJ 1025 水仙花數 
 * 水仙花數定義:一個 n 位數的數字，每一個數字的 n 次方加總等於自身
 */

var readline = require('readline');

var lines = [];
var rl = readline.createInterface({
    input: process.stdin
});

rl.on('line', function (line) {
    lines.push(line);
});

function isNarciss(now) {
    let sum = 0;
    const num = String(now);
    const len = num.length;
    for(let i = 0; i < len; i++) {
        sum += (Number(num[i]) ** len);
    }
    return sum === now;
}

function solve(line) {
    const tmp = line[0].split(' ');
    const str = Number(tmp[0]);
    const end = Number(tmp[1]);
    for(let i = str; i <= end; i++) {
        if (isNarciss(i)){
            console.log(i); 
        }     
    }
}

rl.on('close', () => solve(lines));