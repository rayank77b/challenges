#!/bin/sh

testme() {
	note=$1
	is=$2
	should=$3
	erg=$(/home/afrank/challenges/katas/UpperSchoolGradePoints.bin $note $is)
	#erg="2"
	if [ $erg -eq $should ]
	then
		echo "ok  $is $should  get $erg"
	else
		echo "error  $is $should  get $erg"
		exit 1
	fi
}

testme2() {
	note=$1
	is=$2
	should=$3
	erg=$(/home/afrank/challenges/katas/UpperSchoolGradePoints.bin $note $is)
	#erg="2"
	if [ "$erg" = "$should" ]
	then
		echo "ok  $is $should  get $erg"
	else
		echo "error  $is $should  get $erg"
		exit 1
	fi
}

IS=1+
SHOULD=15
testme "N" $IS $SHOULD
IS=1
SHOULD=14	
testme "N" $IS $SHOULD
IS=1-
SHOULD=13
testme "N" $IS $SHOULD
IS=2+
SHOULD=12
testme "N" $IS $SHOULD
IS=2
SHOULD=11
testme "N" $IS $SHOULD
IS=2-
SHOULD=10	 
testme "N" $IS $SHOULD
IS=3+
SHOULD=9 	
testme "N" $IS $SHOULD
IS=3	
SHOULD=8	 	
testme "N" $IS $SHOULD
IS=3-	
SHOULD=7
testme "N" $IS $SHOULD
IS=4+	
SHOULD=6
testme "N" $IS $SHOULD
IS=4	
SHOULD=5
testme "N" $IS $SHOULD
IS=4-	
SHOULD=4
testme "N" $IS $SHOULD
IS=5+	
SHOULD=3
testme "N" $IS $SHOULD
IS=5	
SHOULD=2
testme "N" $IS $SHOULD
IS=5-	
SHOULD=1
testme "N" $IS $SHOULD
IS=6	
SHOULD=0
testme "N" $IS $SHOULD


SHOULD=1+	
IS=15	
testme2 "P" $IS $SHOULD 	
SHOULD=1	
IS=14	 	
testme2 "P" $IS $SHOULD 	
SHOULD=1-	
IS=13	 	
testme2 "P" $IS $SHOULD 	
SHOULD=2+	
IS=12	 
testme2 "P" $IS $SHOULD 	
SHOULD=2	
IS=11	 	
testme2 "P" $IS $SHOULD 	
SHOULD=2-	
IS=10	 	
testme2 "P" $IS $SHOULD 	
SHOULD=3+	
IS=9	 	
testme2 "P" $IS $SHOULD 	
SHOULD=3	
IS=8	 	
testme2 "P" $IS $SHOULD 	
SHOULD=3-	
IS=7
testme2 "P" $IS $SHOULD 	
SHOULD=4+	
IS=6
testme2 "P" $IS $SHOULD 	
SHOULD=4	
IS=5
testme2 "P" $IS $SHOULD 	
SHOULD=4-	
IS=4
testme2 "P" $IS $SHOULD 	
SHOULD=5+	
IS=3
testme2 "P" $IS $SHOULD 	
SHOULD=5	
IS=2
testme2 "P" $IS $SHOULD 	
SHOULD=5-	
IS=1
testme2 "P" $IS $SHOULD 	
SHOULD=6	
IS=0
testme2 "P" $IS $SHOULD 	





