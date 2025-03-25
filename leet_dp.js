
var maximalSquare = function(matrix) {

if (!matrix.length || !matrix[0].length) return 0;
    
let rows = matrix.length, cols = matrix[0].length;
let dp = Array(rows + 1).fill(0).map(() => Array(cols + 1).fill(0));
let maxSide = 0;


for (let i = 1; i <= rows; i++) {
    for (let j = 1; j <= cols; j++) {
        if (matrix[i - 1][j - 1] === "1") {
            dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1;
            maxSide = Math.max(maxSide, dp[i][j]);
        }
    }
}

return maxSide * maxSide;
}

let matrix = [
    ["1","0","1","0","0"],
    ["1","0","1","1","1"],
    ["1","1","1","1","1"],
    ["1","0","0","1","0"]
]

console.log(maximalSquare(matrix));