const greaterThanY = (array, y) => {
  count = 0;
  newArray = [];
  for (let i = 0; i < array.length; i++) {
    if (array[i] > y) {
      count += 1;
      newArray.push(array[i]);
    }
  }
  console.log(`valores mayores a ${y}: ${newArray}`);
  console.log(`la cantidad de valores son ${count}`);
};

greaterThanY([2, 3, 5, 6, 2, 7, 8, 5], 6);

const maxMinAvg = (array = []) => {
  max = array[0] || 0;
  min = array[0] || 0;
  sum = 0;

  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    } else if (array[i] < min) {
      min = array[i];
    }
    sum += array[i];
  }

  console.log(`max: ${max}, min: ${min}, avg: ${sum / array.length || 0}`);
};

maxMinAvg([2, 3, 4]);

const replaceNegativesToDojo = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (array[i] < 0) {
      array[i] = "Dojo";
    }
  }
  return array;
};

console.log(replaceNegativesToDojo([-1, -2, 3]));

const removeArrayElementByIndex = (array = [], index = 0) => {
  for (let i = 0; i < array.length; i++) {
    if (i === index) {
      array.splice(index, 1);
    }
  }
  return array;
};

console.log(removeArrayElementByIndex([1, 2, 3], 1));
