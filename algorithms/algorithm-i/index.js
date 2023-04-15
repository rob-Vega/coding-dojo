for (var i = 0; i < 5; i++) {
  console.log(i); // 0, 1, 2, 3, 4
}

for (var i = 0; i < 5; i++) {
  i = i + 1;
  console.log(i); // 2, 3, 5
}

for (var i = 0; i < 5; i++) {
  i = i + 3;
  console.log(i); // 4, 7
}

function y(num1, num2) {
  return num1 + num2;
}
console.log(y(2, 3)); // 5
console.log(y(3, 5)); // 8

function y(num1, num2) {
  console.log(num1); // 2, 3
  return num1 + num2;
}
console.log(y(2, 3)); // 5
console.log(y(3, 5)); // 8

a = 15;
console.log(a); // 15
function y(a) {
  console.log(a); // 10
  return a;
}
b = y(10);
console.log(b); // 10

a = 15;
console.log(a); // 15
function y(a) {
  console.log(a); // 10
  return a * 2;
}
b = y(10);
console.log(b); // 20
