// Reverse Int JS Solution

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21


var reverse = function(x) {
   let arr = x.toString().split("");
   let newStr = arr[0] == "-" ? "-" : "";
   let i = arr.length-1;
   while(i>=0) {
    if(arr[i] === "-") {
        break;
    }
    newStr+= arr[i];
    i--;
   }
   console.log(Number(newStr));
   if(Number(newStr) > Number(Math.pow(2, 31))) {
    return 0;
   }
   return Number(newStr);
};


console.log(reverse(1534236469));