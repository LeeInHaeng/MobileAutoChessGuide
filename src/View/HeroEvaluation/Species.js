import React from "react"
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

const ImagePath = {
  //유닛 Unit
  "해일 사냥꾼": require("/images/unit/해일사냥꾼.jpg"),
  "둠 아비터": require("/images/unit/둠아비터.jpg"),
  발톱: require("/images/unit/발톱.jpg"),
  "어둠의 정령": require("/images/unit/어둠의정령.jpg"),
  파멸자: require("/images/unit/파멸자.jpg"),
  "팬텀 퀸": require("/images/unit/팬텀퀸.jpg"),
  자이로콥터: require("/images/unit/자이로콥터.jpg"),
  세이렌: require("/images/unit/세이렌.jpg"),
  "소울 리퍼": require("/images/unit/소울리퍼.jpg"),
  버서커: require("/images/unit/버서커.jpg"),
  용기사: require("/images/unit/용기사.jpg"),
  "영혼 파괴자": require("/images/unit/영혼파괴자.jpg"),
  패천자: require("/images/unit/패천자.jpg"),
  "우뢰의 정령": require("/images/unit/우뢰의정령.jpg"),
  "해적 선장": require("/images/unit/해적선장.jpg"),
  용기사: require("/images/unit/용기사.jpg"),
  땜장이: require("/images/unit/땜장이.jpg"),
  "악마 독충": require("/images/unit/악마독충.jpg"),
  "그림자 마귀": require("/images/unit/그림자마귀.jpg"),
  "폭풍 주술사": require("/images/unit/폭풍주술사.jpg"),
  "코끼리 챔피언": require("/images/unit/코끼리챔피언.jpg"),
  유니콘: require("/images/unit/유니콘.jpg"),
  헬나이트: require("/images/unit/헬나이트.jpg"),
  "늑대 인간": require("/images/unit/늑대인간.jpg"),
  "프로스트 나이트": require("/images/unit/프로스트나이트.jpg"),
  "블레이드 나이트": require("/images/unit/블레이드나이트.jpg"),
  "빛의 자객": require("/images/unit/빛의자객.jpg"),
  "토르톨라족 장로": require("/images/unit/토르톨라족장로.jpg"),
  "마나의 원천": require("/images/unit/마나의원천.jpg"),
  "늑대 인간": require("/images/unit/늑대인간.jpg"),
  "악령 기사": require("/images/unit/악령기사.jpg"),
  절단기: require("/images/unit/절단기.jpg"),
  "유령의 그림자": require("/images/unit/유령의그림자.jpg"),
  "언데드 순찰자": require("/images/unit/언데드순찰자.jpg"),
  "바람 순찰자": require("/images/unit/바람순찰자.jpg"),
  베노맨서: require("/images/unit/베노맨서.jpg"),
  "금기 주술사": require("/images/unit/금기주술사.jpg"),
  "자연의 예언자": require("/images/unit/자연의예언자.jpg"),
  검객: require("/images/unit/검객.jpg"),
  "아르갈리 나이트": require("/images/unit/아르갈리나이트.jpg"),
  "심연의 그림자": require("/images/unit/심연의그림자.jpg"),
  "물의 정령": require("/images/unit/물의정령.jpg"),
  "드워프 소총수": require("/images/unit/드워프소총수.jpg"),
  "황혼의 마법사": require("/images/unit/황혼의마법사.jpg"),
  "화염의 마법사": require("/images/unit/화염의마법사.jpg"),
  "해골 사냥꾼": require("/images/unit/해골사냥꾼.jpg"),
  저주술사: require("/images/unit/저주술사.jpg"),
  "타락한 주술사": require("/images/unit/타락한주술사.jpg"),
  "빛나는 용": require("/images/unit/빛나는용.jpg"),
  베놈: require("/images/unit/베놈.jpg"),
  "빛나는 용": require("/images/unit/빛나는용.jpg"),
  "어비스 가드": require("/images/unit/어비스가드.jpg"),
  "땅의 정령": require("/images/unit/땅의정령.jpg"),
  "오거 마법사": require("/images/unit/오거마법사.jpg"),
  "붉은 도끼 수장": require("/images/unit/붉은도끼수장.jpg"),
  "사막의 주인": require("/images/unit/사막의주인.jpg"),
  배신자: require("/images/unit/배신자.jpg"),
  "현명한 예언자": require("/images/unit/현명한예언자.jpg"),
  //종족 Species
  고블린: require("/images/species/고블린.jpg"),
  동굴족: require("/images/species/동굴족.jpg"),
  드워프족: require("/images/species/드워프족.jpg"),
  빙하족: require("/images/species/빙하족.jpg"),
  악마: require("/images/species/악마.jpg"),
  야수: require("/images/species/야수.jpg"),
  언데드: require("/images/species/언데드.jpg"),
  용족: require("/images/species/용족.jpg"),
  인간족: require("/images/species/인간족.jpg"),
  정령족: require("/images/species/정령족.jpg"),
  조류족: require("/images/species/조류족.jpg"),
  키라: require("/images/species/키라.jpg"),
  해양족: require("/images/species/해양족.jpg"),
}

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
