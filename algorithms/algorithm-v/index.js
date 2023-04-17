const resetNegativeValues = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i] < 0) {
      array[i] = 0;
    }
  }
  return array;
};

console.log(resetNegativeValues([1, 2, -1, -3]));

const moveForeward = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (i === array.length - 1) {
      array[i] = 0;
    } else {
      array[i] = array[i + 1];
    }
  }
  return array;
};

console.log(moveForeward([1, 2, 3]));

const returnReverse = (array = []) => {
  const newArray = [];
  for (let i = array.length - 1; i >= 0; i--) {
    newArray.push(array[i]);
  }
  return newArray;
};

console.log(returnReverse([1, 2, 3]));

const repeatValues = (array = []) => {
  const newArray = [];
  for (let i = 0; i < array.length; i++) {
    newArray.push(array[i]);
    newArray.push(array[i]);
  }
  return newArray;
};

console.log(repeatValues([1, 2, 3]));
