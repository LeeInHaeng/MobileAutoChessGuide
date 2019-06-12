import React, { Component } from "react"
import { StyleSheet, View, Text, List, FlatList, ListItem } from "react-native"

const s = StyleSheet.create({
  container: {
    flex: 1
  },
  categoryView: {
    height: 50,
    backgroundColor: "skyblue",
    flexDirection: "row",
    justifyContent: "space-evenly",
    alignItems: "center"
  }
})

class ItemEvaluation extends Component {
  constructor(props) {
    super(props)
    this.state = {
      category: "Tier",
      viewContent: null,
      tempData: ["티어", "종족", "직업", "돈"]
    }
  }

  render() {
    return (
      <View style={s.container}>
        <View style={s.categoryView}>
          <Text>여기는 아이템평가 페이지.</Text>
        </View>
      </View>
    )
  }
}

export default ItemEvaluation
