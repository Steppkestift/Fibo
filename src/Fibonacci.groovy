def totalClinks = 0
def partyPeople = 100
1.upto(partyPeople) {
        guestNumber ->
        clinksWithQuest = guestNumber-1
        totalClinks += clinksWithQuest
}
assert totalClinks == {partypeople*(partyPeople-1)}/2