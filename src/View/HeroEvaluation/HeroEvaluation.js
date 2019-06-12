import React, { Component } from "react"
import { StyleSheet, View, Text, List, FlatList, ListItem, Image } from "react-native"

const s = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: "column",
    justifyContent: "flex-start",
    alignItems: "stretch"
  },
  categoryView: {
    flex: 5,
    width: "100%",
    flexDirection: "row",
    justifyContent: "space-evenly",
  },
  listView: {
    flex: 95,
    flexDirection: "row",
    borderWidth: 1,
  },
  categoryViewItem: {
    flex: 20,
    borderWidth: 1,
    justifyContent: "center",
    alignItems: "center"
  }
})

class HeroEvaluation extends Component {
  constructor(props) {
    super(props)
    this.state = {
      category: "티어",
      viewContent: null,
      categoryArray: ["티어", "종족", "직업", "돈"]
    }
  }

  render() {
    const { category, categoryArray } = this.state

    alert(category)

    return (
      <View style={s.container}>
        <View style={s.categoryView}>
          <View style={s.categoryViewItem}>
            <Text>카테고리</Text>
          </View>
          {categoryArray.map((item, index) => {
            return (
              <View
                key={index}
                style={s.categoryViewItem}
                onTouchEnd={() => {
                  this.setState({
                    category: item
                  })
                }}
              >
                <Text>{item}</Text>
              </View>
            )
          })}
        </View>
        <View style={s.listView}>
          <Image source={require("/images/preview/검객.jpg")}></Image>
        </View>
      </View>
    )
  }
}

export default HeroEvaluation
