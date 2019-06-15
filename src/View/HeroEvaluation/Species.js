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
  },
  titleImage: {
    height: 18,
    width: 18,
    marginRight: 15
  }
})

const Species = ({ list }) => {
  const goblin = list.filter(item => item.speciesName === "고블린")
  const cave = list.filter(item => item.speciesName === "동굴족")
  const dwarf = list.filter(item => item.speciesName === "드워프족")
  const ice = list.filter(item => item.speciesName === "빙하족")
  const demon = list.filter(item => item.speciesName === "악마")
  const beast = list.filter(item => item.speciesName === "야수")
  const undead = list.filter(item => item.speciesName === "언데드")
  const dragon = list.filter(item => item.speciesName === "용족")
  const human = list.filter(item => item.speciesName === "인간족")
  const element = list.filter(item => item.speciesName === "정령족")
  const bird = list.filter(item => item.speciesName === "조류족")
  const killer = list.filter(item => item.speciesName === "키라")
  const naga = list.filter(item => item.speciesName === "해양족")

  return (
    <SectionGrid
      itemDimension={90}
      fixed
      spacing={20}
      sections={[
        {
          title: "고블린",
          data: goblin
        },
        {
          title: "동굴족",
          data: cave
        },
        {
          title: "드워프족",
          data: dwarf
        },
        {
          title: "빙하족",
          data: ice
        },
        {
          title: "악마",
          data: demon
        },
        {
          title: "야수",
          data: beast
        },
        {
          title: "언데드",
          data: undead
        },
        {
          title: "용족",
          data: dragon
        },
        {
          title: "인간족",
          data: human
        },
        {
          title: "정령족",
          data: element
        },
        {
          title: "조류족",
          data: bird
        },
        {
          title: "키라",
          data: killer
        },
        {
          title: "해양족",
          data: naga
        }
      ]}
      renderItem={({ item }) => <Image style={s.rowImage} source={ImagePath[item.unitName]} />}
      renderSectionHeader={({ section }) => (
        <Text style={s.title}>
          <Image style={s.titleImage} source={ImagePath[section.title]} />
          {section.title}
        </Text>
      )}
    />
  )
}

export default Species
