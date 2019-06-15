import React from "react"
import { ImagePath } from "../../../lib/index"
import { StyleSheet, Text, Image } from "react-native"
import { SectionGrid } from "react-native-super-grid"

const s = StyleSheet.create({
  title: {
    fontSize: 24,
    marginVertical: 10,
    marginLeft: "2.5%"
  },
  rowImage: {
    height: 80,
    width: 80
  }
})

const Cost = ({ list }) => {
  const firstCost = list.filter(item => item.price === 1)
  const secondCost = list.filter(item => item.price === 2)
  const thirdCost = list.filter(item => item.price === 3)
  const fourthCost = list.filter(item => item.price === 4)
  const fifthCost = list.filter(item => item.price === 5)

  return (
    <SectionGrid
      itemDimension={90}
      fixed
      spacing={20}
      sections={[
        {
          title: "1코스트",
          data: firstCost
        },
        {
          title: "2코스트",
          data: secondCost
        },
        {
          title: "3코스트",
          data: thirdCost
        },
        {
          title: "4코스트",
          data: fourthCost
        },
        {
          title: "5코스트",
          data: fifthCost
        }
      ]}
      renderItem={({ item }) => <Image style={s.rowImage} source={ImagePath[item.unitName]} />}
      renderSectionHeader={({ section }) => <Text style={s.title}>{section.title}</Text>}
    />
  )
}

export default Cost
