# twosum

## Description

Given an array of integers num and an integer target. Return the indices of the two numbers that add up to target.

## Workflow

We will need to iterate through the array nums until a sum of two indices add up to target. To do this two indices need to be checked under an if statement for the sum and if true then return the two indices. nums[i] and nums[j] will be used to check if the sum matches target. A nested for loop is needed to check if j will complete the sum to i. If the first iteration does not match then iterate once more but i is incremented by 1. This for loop will continue to increment 1 until i and j match target.

## Libraries

Import `java.util.Arrays ` to use toString() to return the indices in a string.
