def totalClinks = 0
    for(int guestNumber = 1;
            guestNumber <= partyPeople;
            guestNumber++) {
        int clinksWithGuest = guestNumber-1;
        totalClinks += clinksWithGuest;
    }


