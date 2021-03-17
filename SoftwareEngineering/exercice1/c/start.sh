FILE=./main
if test -f "$FILE"; then
    rm "$FILE"
fi
gcc -W main.c -o main
./main