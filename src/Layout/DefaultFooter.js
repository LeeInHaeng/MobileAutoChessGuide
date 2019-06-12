import React, { Component } from "react"
import { StyleSheet, Text, View } from "react-native"
import store from "../../store"
import { setSelectedMenuAction } from "../../action/commonInfo"

const s = StyleSheet.create({
  container: {
    height: 70,
    backgroundColor: "pink",
    flexDirection: "row",
    justifyContent: "space-evenly",
    alignItems: "center"
  },
  items: {
    flex: 33,
    height: 70,
    borderWidth: 1,
    flexDirection: "row",
    justifyContent: "center",
    alignItems: "center"
  }
})

class DefaultFooter extends Component {
  constructor(props) {
    super(props)
    this.state = {
      foo: "bar"
    }
  }

  render() {
    return (
      <View style={s.container}>
        <View
          style={s.items}
          onTouchEnd={() => {
            store.dispatch(setSelectedMenuAction("hero"))
          }}
        >
          <Text>영웅 평가</Text>
        </View>
        <View
          style={s.items}
          onTouchEnd={() => {
            store.dispatch(setSelectedMenuAction("synergy"))
          }}
        >
          <Text>시너지</Text>
        </View>
        <View
          style={s.items}
          onTouchEnd={() => {
            store.dispatch(setSelectedMenuAction("item"))
          }}
        >
          <Text>아이템 평가</Text>
        </View>
      </View>
    )
  }
}

export default DefaultFooter
