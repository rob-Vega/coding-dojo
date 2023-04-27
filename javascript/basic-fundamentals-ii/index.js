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

const positivesNumbersCount = (array = []) => {
  let count = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] > 0) {
      count += 1;
    }
  }
  for (let i = array.length - 1; i >= 0; i--) {
    if (array[i] > 0) {
      array[i] = count;
      return array;
    }
  }
};

console.log(positivesNumbersCount([1, 2, -3, 4, 5, -1, -1]));

const evenAndOdd = (array = []) => {
  let evenCount = 0;
  let oddCount = 0;

  array.forEach((element) => {
    if (element % 2 === 0) {
      evenCount += 1;
      oddCount = 0;
    } else {
      oddCount += 1;
      evenCount = 0;
    }

    if (evenCount % 3 === 0 && evenCount !== 0) {
      console.log("Es para bien!");
    } else if (oddCount % 3 === 0 && oddCount !== 0) {
      console.log("Que imparcial!");
    }
  });
};

evenAndOdd([3, 3, 3, 7, 9, 13]);

const incrementSeconds = (array = []) => {
  for (let i = 0; i < array.length; i++) {
    if (i % 2 === 1) {
      array[i] = array[i] += 1;
    }
    console.log(array[i]);
  }
  return array;
};

console.log(incrementSeconds([1, 2, 3, 4, 5]));

const previousLengths = (array = []) => {
  return array.map((value) => value.length);
};

console.log(previousLengths(["Roberto", "Paula", "Wilson"]));

const addSeven = (array = []) => {
  const newArray = array.map((value) => value + 7);
  console.log("array original", array);
  return newArray;
};

console.log(addSeven([1, 2, 3, 4, 5]));

const inverseArray = (array = []) => {
  const newArray = [];
  for (let i = array.length - 1; i >= 0; i--) {
    newArray.push(array[i]);
  }
  return newArray;
};

console.log(inverseArray([1, 2, 3, 4, 5, 6, 7]));

const alwaysHungry = (array = []) => {
  if (!array.includes("comida")) {
    console.log("Tengo hambre :(");
    return;
  }
  array.forEach((value) => {
    if (value.toLowerCase() === "comida") {
      console.log("Yummy ;P");
    }
  });
};

alwaysHungry(["comida", "comida", "no hay comida"]);
alwaysHungry(["no hay comida", "no hay comida"]);

const changeToTheCenter = (array = []) => {
  let temp;
  for (let i = 0; i < Math.floor(array.length / 2); i++) {
    temp = array[i];
    array[i] = array[array.length - 1 - i];
    array[array.length - 1 - i] = temp;
  }
  console.log(array);
};

changeToTheCenter([1, 2, 3, 4, 5, 7, 8]);

const scaleTheArray = (array = [], num = 0) => {
  if (array.length === 0) return;
  return array.map((value) => value * num);
};

console.log(scaleTheArray([1, 2, 3, 4, 5, 6, 7], 4));
