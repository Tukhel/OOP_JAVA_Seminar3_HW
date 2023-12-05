package Seminar_3_HW;

import java.util.List;

public class StreamService {
    public void sortStream (List<Stream> streamList) {
        streamList.sort(new StreamComporator());
    }
}
