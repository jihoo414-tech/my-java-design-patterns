package com.back.singleton;


public class Main {
    public static void main(String[] args) {
        // 1. 첫 번째 참조를 통한 싱글톤 접근 및 데이터 조회
        AppConfig config1 = AppConfig.INSTANCE;
        System.out.println("App Name: " + config1.getSetting("appName"));

        // 2. config1을 통한 설정 변경
        System.out.println("\n[설정 변경] maxConnections 값을 100으로 추가합니다.");
        config1.setSetting("maxConnections", "100");

        // 3. 두 번째 참조를 통해 싱글톤 접근
        AppConfig config2 = AppConfig.INSTANCE;

        // 4. config1과 config2가 완전히 같은 객체인지 확인 (주소값 비교)
        System.out.println("\nconfig1과 config2는 같은 인스턴스인가? " + (config1 == config2));

        // 5. config2에서 config1이 추가한 데이터를 조회 가능한지 확인
        System.out.println("config2에서 조회한 maxConnections: " + config2.getSetting("maxConnections"));

        // 6. 전체 설정 상태 출력
        System.out.println();
        config2.printAllSettings();
    }
}