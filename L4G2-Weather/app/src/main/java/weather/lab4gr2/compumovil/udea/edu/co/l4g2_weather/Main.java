package weather.lab4gr2.compumovil.udea.edu.co.l4g2_weather;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lis on 28/04/16.
 */
public class Main {
    @SerializedName("temp")
    String temp;
    @SerializedName("temp_min")
    String temp_min;
    @SerializedName("temp_max")
    String temp_max;
    @SerializedName("pressure")
    String pressure;
    @SerializedName("sea_level")
    String sea_level;
    @SerializedName("grnd_level")
    String grnd_level;
    @SerializedName("humidity")
    String humidity;

    public String getTemp() {
        return temp;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSea_level() {
        return sea_level;
    }

    public String getGrnd_level() {
        return grnd_level;
    }

    public String getHumidity() {
        return humidity;
    }
}
