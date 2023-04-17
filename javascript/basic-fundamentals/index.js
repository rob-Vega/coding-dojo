const from0to255 = () => {
  array = [];
  for (let i = 0; i <= 255; i++) {
    array.push(i);
  }
  return array;
};

console.log(from0to255());

const evenUpTo1000 = () => {
  sum = 0;
  for (let i = 0; i <= 1000; i++) {
    if (i % 2 === 0) {
      sum += i;
    }
  }
  return sum;
};

console.log(evenUpTo1000());

const oddUpTo1000 = () => {
  sum = 0;
  for (let i = 1; i <= 5000; i++) {
    if (i % 2 === 1) {
      sum += i;
    }
  }
  return sum;
};

console.log(oddUpTo1000());

const totalSumOfArray = (array = []) => {
  sum = 0;
  for (let i = 0; i < array.length; i++) {
    sum += array[i];
  }
  return sum;
};

console.log(totalSumOfArray([1, 2, 3]));

const findMaxValue = (array = []) => {
  max = array[0];
  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    }
  }
  return max;
};

console.log(findMaxValue([1, 2, 3, 4]));

const findAvg = (array = []) => {
  sum = 0;
  for (let i = 0; i < array.length; i++) {
    sum += array[i];
  }
  return sum / array.length;
};

console.log(findAvg([1, 2, 3, 4]));

const oddNumbersArray = (array = []) => {
  const newArray = [];
  for (let i = 0; i < array.length; i++) {
    if (array[i] % 2 === 1) {
      newArray.push(array[i]);
    }
  }
  return newArray;
};

console.log(oddNumbersArray([1, 2, 3, 4, 5]));

const greaterThanY = (array = [], y = 0) => {
  const newArray = [];
  for (let i = 0; i < array.length; i++) {
    if (array[i] > y) {
      newArray.push(array[i]);
    }
  }
  return newArray;
};

console.log(greaterThanY([1, 2, 3, 4], 2));

const sqrt = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    array[i] = array[i] ** 2;
  }
  return array;
};

console.log(sqrt([1, 5, 10, -2]));

const negatives = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i] < 0) {
      array[i] = 0;
    }
  }
  return array;
};

console.log(negatives([1, 5, 10, -2]));

const maxMinAvg = (array = []) => {
  let max = array[0];
  let min = array[0];
  let sum = 0;
  const newArray = [];

  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    } else if (array[i] < min) {
      min = array[i];
    }
    sum += array[i];
  }
  newArray.push(max);
  newArray.push(min);
  newArray.push(sum / array.length);

  return newArray;
};

console.log(maxMinAvg([1, 5, 10, -2]));

const changeValues = (array = []) => {
  const newArray = [];
  for (let i = array.length - 1; i >= 0; i--) {
    newArray.push(array[i]);
  }
  return newArray;
};

console.log(changeValues([1, 5, 10, -2]));

const changeNegatives = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i] < 0) {
      array[i] = "Dojo";
    }
  }
  return array;
};

console.log(changeNegatives([-1, -3, 2]));
