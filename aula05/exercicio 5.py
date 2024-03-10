def allMatches(lst):
    matches=[]
    for team1 in lst:
        for team2 in lst:
            if team1 != team2:
                matches.append((team1,team2))
    return matches


def main():
    teams=["SCP","FCP","SLB"]
    print(allMatches(teams))
main()