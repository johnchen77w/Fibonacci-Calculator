all: asn1_a

asn1_a: asn1_a.cpp
	g++ -o asn1_a asn1_a.cpp

clean:
	-rm asn1_a