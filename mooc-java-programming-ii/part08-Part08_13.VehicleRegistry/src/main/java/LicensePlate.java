
import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LicensePlate that = (LicensePlate) o;

        if (!Objects.equals(liNumber, that.liNumber)) return false;
        return Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        int result = liNumber != null ? liNumber.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
