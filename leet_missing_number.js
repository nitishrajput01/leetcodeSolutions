// first missing positive number 



const a  = [4,2,-1, 1, 6, 5, 3, 7, 9];
let i = a.length-1;
let positiveNumber = 0;

const b = a.filter((val)=> val>=0).sort();

for(let i=0; i<b.length; i++) {
    if(b[i] !== i+1) {
        positiveNumber = i+1;
        break;
    }
}

console.log(positiveNumber);