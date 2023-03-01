def main():

    while True:

        n = int(input())

        if n == 0:
            break

        suspects = list(map(int, input().split())) #recebe o array e o separa, usando map para converter elementos para int
        mostSuspicious = max(suspects)
        secondMostSuspicious = max(suspect for suspect in suspects if suspect != mostSuspicious)

        suspectIndex = suspects.index(secondMostSuspicious) + 1

        print(suspectIndex)     

if __name__ == '__main__':
    main()
    