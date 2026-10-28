'use strict';

/** Small application used to prove the pipeline runs end to end. */

function add(left, right) {
  return left + right;
}

function greeting(name) {
  if (!name || name.trim() === '') {
    return 'Hello, stranger!';
  }
  return `Hello, ${name.trim()}!`;
}

module.exports = { add, greeting };

if (require.main === module) {
  console.log(greeting(process.argv[2]));
}
