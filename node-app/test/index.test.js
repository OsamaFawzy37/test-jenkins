'use strict';

const test = require('node:test');
const assert = require('node:assert');

const { add, greeting } = require('../src/index.js');

test('adds two numbers', () => {
  assert.strictEqual(add(2, 2), 4);
});

test('greets by name', () => {
  assert.strictEqual(greeting('  Omnia  '), 'Hello, Omnia!');
});

test('greets a stranger on a blank name', () => {
  assert.strictEqual(greeting('   '), 'Hello, stranger!');
});
