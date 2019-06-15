import React, { Component } from "react"
import { StyleSheet, View, Text, List, FlatList, ListItem, Image, ScrollView } from "react-native"
import Tier from "./Tier"
import Species from "./Species"

const s = StyleSheet.create({
  container: {
    flex: 1
  },
  advertisement: {
    flex: 0,
    height: 70,
    width: "100%"
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
})



class HeroEvaluation extends Component {
  constructor(props) {
    super(props)
    this.state = {
      category: "티어",
      categoryArray: ["티어", "종족", "직업", "돈"],
      list: []
    }
  }

  componentDidMount() {
    fetch("http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/unitList")
      .then(response => {
        return response.json()
      })
      .then(responseJson => {
        this.setState({
          list: responseJson
        })
      })
      .catch(error => console.log(error))
  }

  render() {
    const { category, categoryArray, list } = this.state

    return (
      <View style={s.container}>
        <View style={s.advertisement}>
          <Text>광고</Text>
        </View>
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
        {category === "티어" ? <Tier list={list} /> : category === "종족" ? <Species list={list} /> : null

        }
      </View>
    )
  }
}

export default HeroEvaluation
