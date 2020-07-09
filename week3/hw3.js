/**
 * LIOJ 1020 判斷質數
 */
var readline = require('readline');

var lines = [];
var rl = readline.createInterface({
    input: process.stdin
});

rl.on('line', function (line) {
    lines.push(line);
});

function isPrimeNum(num) {
    if (num === 1) return false;
    for (let j = 2; j <= num / 2; j++) {
        if (num % j === 0) {
            return false;
        }
    }
    return true;
}

function solve(line) {
    const times = Number(line[0]);
    for (let i = 1; i <= times; i++) {
        isPrimeNum(Number(line[i])) ? console.log('Prime') : console.log('Composite');
    }
}

rl.on('close', () => solve(lines));