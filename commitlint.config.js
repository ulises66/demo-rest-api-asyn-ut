/**
 const type =
 [
 'feat',
 'fix',
 'docs',
 'style',
 'refactor',
 'test',
 'revert'
 ]
 */

// controllers
const scope = ['core', 'search']

module.exports = {extends: ['@commitlint/config-conventional'],
    rules: {
        'header-max-length': [2, 'always', Infinity],
        'scope-enum': [2, 'always', scope],
        'subject-case': [2, 'always', 'sentence-case'],
        'references-empty': [2, 'never']
    }}
