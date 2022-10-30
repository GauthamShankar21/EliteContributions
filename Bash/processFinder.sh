#! /bin/bash

echo "Enter a process name to search\n"
read process
ps -ax | grep $process

