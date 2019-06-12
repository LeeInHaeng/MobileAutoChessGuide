import React, { Component } from "react"
import { StyleSheet, View, Text, List, FlatList, ListItem, Image, ScrollView } from "react-native"

const s = StyleSheet.create({
  container: {
    flex: 1,
    flexDirection: "column",
    justifyContent: "flex-start",
    alignItems: "stretch"
  },
  categoryView: {
    flex: 0,
    height: 50,
    width: "100%",
    flexDirection: "row",
    justifyContent: "space-evenly"
  },
  categoryViewItem: {
    flex: 20,
    height: "100%",
    borderWidth: 1,
    justifyContent: "center",
    alignItems: "center"
  },
  listView: {
    flex: 93,
    flexDirection: "column",
    justifyContent: "space-evenly",
    overflow: "scroll",
    borderWidth: 1
  },
  listRow: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    paddingVertical: 10,
    paddingHorizontal: 30,
    margin: 2,
    borderColor: "#2a4944",
    borderWidth: 1
  },
  title: {
    fontSize: 24
  }
})

class HeroEvaluation extends Component {
  constructor(props) {
    super(props)
    this.state = {
      category: "티어",
      categoryArray: ["티어", "종족", "직업", "돈"]
    }
  }

  componentDidMount() {
    fetch()
  }

  render() {
    const { category, categoryArray } = this.state

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
        <ScrollView>
          <Text style={s.title}>1티어</Text>
          {[1, 2, 3].map((item, index) => {
            return (
              <View style={s.listRow} key={index}>
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
              </View>
            )
          })}
          <Text style={s.title}>2티어</Text>
          {[1, 2, 3].map((item, index) => {
            return (
              <View style={s.listRow} key={index}>
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
                <Image style={s.rowImage} source={require("/images/preview/검객.jpg")} />
              </View>
            )
          })}
        </ScrollView>
      </View>
    )
  }
}

export default HeroEvaluation
