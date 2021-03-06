package Metro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubwayLine {
    private String lineName;
    private String lineId;
    private String color;

    List<SubwayStation> stations = new ArrayList<>();

    public SubwayLine(String lineName, String lineId, String color) {
        this.lineName = lineName;
        this.lineId = lineId;
        this.color = color;
    }

    public void addStationToLine(SubwayStation station){
        if (!stations.contains(station)){
        stations.add(station);}
    }

    public int stationCount(){
       return stations.size();
    }
}
