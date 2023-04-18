const bigSize = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i] > 0) {
      array[i] = "big";
    }
  }
  return array;
};

console.log(bigSize([-1, 3, 5, -5]));

const printMinReturnMax = (array = []) => {
  let max = array[0];
  let min = array[0];

  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    } else if (array[i] < min) {
      min = array[i];
    }
  }
  console.log(min);
  return max;
};

console.log(printMinReturnMax([1, 2, 3, 4, 5]));

const returnDouble = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    array[i] = array[i] * 2;
  }
  return array;
};

console.log(returnDouble([1, 2, 3, 4, 5]));
