def getModeMedian(list):
    mode,median = 0,0 #1 kere calısacak a diyelim

    #mode
    for number in list: #Listeyi 5 elemanlı kabul edelim burası 5 kere calısacak. yani 5b diyelim
        if list.count(number) > list.count(mode):#en kötü durumda burası 3 kere calısır.Yani bu for kısmı toplamda 15b olur.
            mode = number

    #bubble sort
    #iç içe for döngüsü var burası toplamda 5 iç 5 üst döngü olmak üzere 25 kere calisir buna 25 c diyelim.
    for i in range(len(list)):
        for j in range(len(list) - 1):
            if list[j] > list[j + 1]:
                list[j], list[j + 1] = list[j + 1], list[j]
    #median
    median_index=int(len(list)/2) # 1kere calısır 1d diyelim.
    if(median_index % 2 == 0):# burasıda en kötü durumda 1 kere calısır.
        median = (list[median_index - 1] + list[median_index]) / 2
    else:
        median = list[median_index]

    return mode,median
 # M=A+15B+25C+D oldu. Değerleri genellersek ve n cinsinden yazarsak.
 # M=1+3n+n**2+n oldu. Basit satırları 1 kabul ettik.
 # M=n**2+4n+1  geldi.2. dereceden bir polinom.Burdanda (big-oh) n**2 gelir.
 # M=O(n**2)
list=[1,2,3,3,2]
print(getModeMedian(list))