const sigma = (num = 0) => {
  let sum = 0;
  if (num <= 0) return;
  for (let i = 1; i <= num; i++) {
    sum += i;
  }
  return sum;
};

console.log(sigma(5));

const factorial = (num = 0) => {
  let product = 1;
  if (num <= 0) return;
  for (let i = 1; i <= num; i++) {
    product *= i;
  }
  return product;
};

console.log(factorial(5));

function fibonacci(num) {
  let a = 1;
  let b = 1;
  let sum;
  for (let i = 2; i < num; i++) {
    sum = a + b;
    a = b;
    b = sum;
  }
  return b;
}

console.log(fibonacci(6));
