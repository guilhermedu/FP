# A program for counting letter frequencies in a text file.

import sys

def letterCount(text, counts):
    """Count letters in text (a string) and update the counts dictionary."""
    for c in text:
        if c.isalpha():
            c = c.lower()
            counts[c] = counts.get(c, 0) + 1

def printCounts(counts):
    """Show counts dictionary, one item per row."""
    for key,count in sorted(counts, key= lambda t:t[1],reverse=True):
        print(key, count)

def main(argv):
    if len(argv) < 2:
        print("Usage: python3 {} FILE".format(argv[0]))
        exit(1)
    fname = argv[1]
    counts = {}
    f = open(fname)
    for line in f:
        letterCount(line, counts)
    f.close()

    printCounts(counts)

#START
if __name__ == "__main__":
    main(sys.argv)


