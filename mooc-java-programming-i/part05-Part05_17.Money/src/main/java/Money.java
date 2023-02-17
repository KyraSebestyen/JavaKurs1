
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newEuros = 0;
        int newCents = 0;

        if (this.cents + addition.cents < 100) {
            newEuros = this.euros + addition.euros;
            newCents = this.cents + addition.cents;
        } else {
            int additionCents = addition.cents;
            while (additionCents > 100) {
                newEuros++;
                additionCents -= 100;
            }
            newEuros = newEuros + addition.euros + this.euros;
            newCents = newCents + additionCents + this.cents;
        }
        return new Money(newEuros, newCents);
    }


    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        }
        int newEuros = 0;
        int newCents = 0;

        if (this.cents - decreaser.cents >= 0) {
            newEuros = this.euros - decreaser.euros;
            newCents = this.cents - decreaser.cents;
        } else {
            int howManyEurosThroughCents = 0;
            int decreaserCents = decreaser.cents;
            while (this.cents - decreaserCents < 0) {
                howManyEurosThroughCents++;
                decreaserCents -= 100;
            }
            newCents = 100 + (this.cents - decreaser.cents);
            newEuros = this.euros - decreaser.euros - howManyEurosThroughCents;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros > compared.euros) {
            return false;
        }
        return this.cents < compared.cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
