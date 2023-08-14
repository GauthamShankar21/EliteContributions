#! /bin/bash

echo "Hello $(whoami)! Your are using $(uname) operating system and Kernel."
echo "Uptime: $(uptime)"
echo "Current processes running:\n"
ps -ax

