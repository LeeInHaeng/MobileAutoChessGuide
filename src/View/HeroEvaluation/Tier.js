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

const Tier = ({ list }) => {
  const firstTier = list.filter(item => item.tier === 1)
  const secondTier = list.filter(item => item.tier === 2)
  const thirdTier = list.filter(item => item.tier === 3)
  const fourthTier = list.filter(item => item.tier === 4)
  const fifthTier = list.filter(item => item.tier === 5)

  return (
    <SectionGrid
      itemDimension={90}
      fixed
      spacing={20}
      sections={[
        {
          title: "1티어",
          data: firstTier
        },
        {
          title: "2티어",
          data: secondTier
        },
        {
          title: "3티어",
          data: thirdTier
        },
        {
          title: "4티어",
          data: fourthTier
        },
        {
          title: "5티어",
          data: fifthTier
        }
      ]}
      renderItem={({ item }) => <Image style={s.rowImage} source={ImagePath[item.unitName]} />}
      renderSectionHeader={({ section }) => <Text style={s.title}>{section.title}</Text>}
    />
  )
}

export default Tier
