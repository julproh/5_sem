//Ключевые слова let и  сщтые -  на замену слову var

let name = 'Joe';
name = 'Bob';

const pi = 3.14;
// pi = 5; - error

const names = ['Peter', 'Bob'];
names.push('Jenny');
console.log(names);

// менять значения элементов константного массива нельзя

const person = {
    name: 'Joe',
    age: 25
};
person.name = 'Bob';
// нельзя person = 'Alice';

