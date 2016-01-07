#!/bin/sh
#


for l in $(seq 0 15)
do
echo -n "P $l > "
erg=$(./UpperSchoolGradePoints.bin "P" "$l")
echo -n "$erg  > "
./UpperSchoolGradePoints.bin "N" "$erg"
echo " "
done

