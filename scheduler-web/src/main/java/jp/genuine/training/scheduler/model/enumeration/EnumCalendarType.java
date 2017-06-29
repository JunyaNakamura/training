package jp.genuine.training.scheduler.model.enumeration;

public enum EnumCalendarType {

	SCHEDULE(1),
	PERFORMANCE(2);


	private final int id;

	private EnumCalendarType(final int id){
		this.id = id;
	}

	// id から、定数オブジェクトを逆引きするメソッド
    public static EnumCalendarType valueOf(int id) {
        // values() で、列挙したオブジェクトをすべて持つ配列が得られる
        for (EnumCalendarType num : values()) {
            if (num.getId() == id) { // id が一致するものを探す
                return num;
            }
        }

        throw new IllegalArgumentException("no such enum object for the id: " + id);
    }

    public int getId() {
        return id;
    }
}
