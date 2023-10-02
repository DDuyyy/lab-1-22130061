package chapter2.agent_AB;

public class AgentProgram {
    public Action execute(Percept p) {
        String location = p.getAgentLocation(); // Lấy thông tin vị trí của agent
        Environment.LocationState state = p.getLocationState(); // Lấy trạng thái của vị trí

        // Kiểm tra vị trí của agent và trạng thái của vị trí
        if (location.equals(Environment.LOCATION_A) && state == Environment.LocationState.CLEAN) {
            // Nếu agent ở vị trí A và vị trí A là sạch, thực hiện hành động CLEAN
            return new CleanAction();
        } else if (location.equals(Environment.LOCATION_B) && state == Environment.LocationState.DIRTY) {
            // Nếu agent ở vị trí B và vị trí B là dơ, thực hiện hành động SUCK (hút bụi)
            return new SuckAction();
        } else {
            // Nếu không thỏa mãn điều kiện nào, trả về hành động NoOp (không thực hiện hành động)
            return NoOpAction.NO_OP;
        }
    }
}
