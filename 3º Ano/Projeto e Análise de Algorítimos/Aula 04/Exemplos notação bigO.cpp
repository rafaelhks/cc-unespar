//a)
sum=0;
for(i=1; i<=n; i++)
	for(j=1; j<=i;j++)
			sum++;
//RESULTADO: O(n²)

//b)
sum=0;
for(i=1; i<=n; i++)
	for(j=i; j<=n;j++)
			sum++;
			

//RESULTADO: O(n²)
