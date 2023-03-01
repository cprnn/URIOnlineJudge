def main():

    n = []
    n.append(int(input()))

    for i in range(10):
        n.append(n[i]*2)
        print(f"N[{i}] = " + str(n[i]))

if __name__ == '__main__':
    main()