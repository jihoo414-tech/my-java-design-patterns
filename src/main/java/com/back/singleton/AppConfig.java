package com.back.singleton;

import java.util.HashMap;
import java.util.Map;
//enum을 이용하면, 싱글톤 패턴을 가장 효율적으로 구현할 수 있다.
public enum AppConfig {

    // 단 하나의 인스턴스
    INSTANCE;

    // 설정을 저장할 내부 데이터 구조
    private final Map<String, String> settings = new HashMap<>();

    // Enum의 생성자는 기본적으로 private이며, 애플리케이션 로딩 시 단 한 번 실행됩니다.
    AppConfig() {
        // 기본 설정 초기화
        settings.put("appName", "MyDesignPatternApp");
        settings.put("version", "1.0.0");
        settings.put("dbUrl", "jdbc:mysql://localhost:3306/mydb");
    }

    // 데이터 조회 메서드
    public String getSetting(String key) {
        return settings.getOrDefault(key, "NOT_FOUND");
    }

    // 데이터 저장/수정 메서드
    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    // 전체 설정 출력용 메서드
    public void printAllSettings() {
        System.out.println("=== Current App Settings ===");
        settings.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("============================");
    }
}