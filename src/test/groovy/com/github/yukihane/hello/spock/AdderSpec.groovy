package com.github.yukihane.hello.spock

import spock.lang.*

class AdderSpec extends spock.lang.Specification{
    def "2値の加算"() {
        when: "新しいAdderオブジェクトが生成された"
        def adder = new Adder();

        then: "1 と 1 を加えると 2になる"
        adder.add(1, 1) == 2
    }

    def "可換則が成立する"() {
        when: "新しいAdderオブジェクトが生成された"
        def adder = new Adder();

        then: "2 と 3 を加えると 5 になる"
        adder.add(2, 3) == 5

        then: "3 と 2 を加えると 5 になる"
        adder.add(3, 2) == 5
    }
}