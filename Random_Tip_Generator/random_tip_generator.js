let button=document.getElementById('tip_button');
let text=document.getElementById('tip_output');
let tips=[
  "Use less energy by lowering your heating and cooling, switching to LED light bulbs and energy-efficient electric appliances, washing your laundry with cold water, or hanging things to dry instead of using a dryer.",
  "Choose products from companies who use resources responsibly and are committed to cutting their gas emissions and waste.",
  "To protect our climate, buy fewer things, shop second-hand, repair what you can, and recycle.",
  "Walking or riding a bike instead of driving will reduce greenhouse gas emissions -- and help your health and fitness. For longer distances, consider taking a train or bus. And carpool whenever possible.",
  "If possible, see if you can switch to renewable sources such as wind or solar. Or install solar panels on your roof to generate energy for your home.",
  "Try using your wilting, browning, or imperfect produce to make sweet smoothies, bread, jams, sauces, or soup stocks.",
  "Make a shopping list and stick to it when you go shopping. Plan ahead and shop with specific meals in mind.",
  "Recycling batteries significantly reduces the dangers these batteries pose to human health and the environment by diverting them from landfills and incinerators.",
  "The best thing you can do is to resist buying a new device until you really need it. Try to get your old product repaired if possible and if it can’t be fixed, resell or recycle it responsibly.",
  "Technology is advancing at such a rapid pace, so directing funding and research into technological biodiversity loss prevention methods can be extremely beneficial.",
  "Leave native plants undisturbed, and landscape using native trees and vegetation. Native plants are well adapted to local conditions and provide a low maintenance, drought resistant garden and can prevent local flooding.",
  "An idling engine creates a hot spot of pollution. Buses and big trucks produce particularly unhealthy exhaust.",
  "Reduce your plastic consumption and reuse or recycle plastic when you can.",
  "Don’t throw litter into rivers, lakes or oceans. Help clean up any litter you see on beaches or in rivers and lakes, make sure it is safe to collect the litter and put it in a nearby dustbin.",
  "Involve local communities in the design, implementation and assessment of sustainable land and soil management",
  "Control weeds by hand picking them and then applying mulch from wood chips or grass clippings. This mulch acts as a natural fertilizer, reducing the need for chemical fertilizers.",
  "Use reusable bags when you go shopping, such as canvas tote bags.",
  "If you believe a company could be smarter about its packaging, make your voice heard. Write a letter, send a tweet, or give your money to a sustainable competitor.",
  "Ask for unbleached paper products or products bleached with hydrogen, which produce less pollution during papermaking.",
  "Switching from a mixed to a vegetarian diet can reduce your carbon footprint by up to 500 kilograms of CO2e per year",
  "Keep the stems of vegetables such as broccoli, celery and asparagus in water to help them stay fresh and crisp.",
  "Extend the life of your electronics by buying a case, keep your device clean, and avoid overcharging the battery.",
  "If you need to fly for work, consider using video-conferencing instead. For trips in the same country or continent, take the train or explore options using an electric car. When flying is unavoidable, pay a little extra for carbon offsetting.",
  "Give unwanted items a new life by donating them to charity or selling them on.",
  "Do your part by choosing slightly imperfect produce at the grocery store, or better yet, directly from the farmer.",
  "The outer layers of potatoes, carrots, cucumbers, mangoes, kiwis and eggplants are edible and nutritious. Not only is eating the skin delicious, it’s economical and reduces your food waste impact.",
  "If an electronic item is still in good working order or requires only minor repairs, think about giving it to someone else.",
  "Support local and regional projects aimed at tackling biodiversity loss.",
  "Support political action committed to protecting and restoring biodiversity.",
  "Educate children about biodiversity, ecosystems and the threats they face and the opportunities to restore them.",
  "Support institutions that promote the protection and restoration of biodiversity.",
  "Taking five-minute showers and turning the water off while washing your hands, doing the dishes, or brushing your teeth are all easy ways to conserve water.",
  "Don’t throw paints, oils or other forms of litter down the drain.",
  "Use environmentally household products, such as washing powder, household cleaning agents and toiletries.",
  "Consider getting your milk delivered in glass bottles which are reused and recycled instead of a plastic pint.",
  "Use air conditioning sparingly as it significantly increases fuel consumption.",
  "The heavier the content of your car, the more fuel it requires to move it. Keep your boot clear of heavy objects where possible.",
  "Only use the lights you need. Turn off lights in unused rooms.",
  "Get your car serviced regularly to keep it running efficiently.",
  "Think before you print – but if you have to print at all, print double-sided – you can even print multiple pages to a sheet."
];

function generateTip() {
  const randomIndex = Math.floor(Math.random() * tips.length);
  const randomTip = tips[randomIndex];
  tip_output.innerHTML=randomTip;
}

button.addEventListener('click', generateTip);
